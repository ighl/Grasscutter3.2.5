// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CardProductRewardNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CardProductRewardNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CardProductRewardNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CardProductRewardNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CardProductRewardNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dCardProductRewardNotify.proto\"Q\n\u0017CardProductRewardNotify\u0012\r\n\u0005hcoin\u0018\u0006 \u0001(\r\u0012\u0012\n\nproduct_id\u0018\u000e \u0001(\t\u0012\u0013\n\u000bremain_days\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CardProductRewardNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CardProductRewardNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CardProductRewardNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor, new String[] { "Hcoin", "ProductId", "RemainDays" });
    }
    
    public static final class CardProductRewardNotify extends GeneratedMessageV3 implements CardProductRewardNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int HCOIN_FIELD_NUMBER = 6;
        private int hcoin_;
        public static final int PRODUCT_ID_FIELD_NUMBER = 14;
        private volatile Object productId_;
        public static final int REMAIN_DAYS_FIELD_NUMBER = 1;
        private int remainDays_;
        private byte memoizedIsInitialized;
        private static final CardProductRewardNotify DEFAULT_INSTANCE;
        private static final Parser<CardProductRewardNotify> PARSER;
        
        private CardProductRewardNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CardProductRewardNotify() {
            this.memoizedIsInitialized = -1;
            this.productId_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CardProductRewardNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CardProductRewardNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.remainDays_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.hcoin_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            final String s = input.readStringRequireUtf8();
                            this.productId_ = s;
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CardProductRewardNotify.class, Builder.class);
        }
        
        @Override
        public int getHcoin() {
            return this.hcoin_;
        }
        
        @Override
        public String getProductId() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.productId_ = s);
        }
        
        @Override
        public ByteString getProductIdBytes() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.productId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getRemainDays() {
            return this.remainDays_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.remainDays_ != 0) {
                output.writeUInt32(1, this.remainDays_);
            }
            if (this.hcoin_ != 0) {
                output.writeUInt32(6, this.hcoin_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                GeneratedMessageV3.writeString(output, 14, this.productId_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.remainDays_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.remainDays_);
            }
            if (this.hcoin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.hcoin_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                size += GeneratedMessageV3.computeStringSize(14, this.productId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardProductRewardNotify)) {
                return super.equals(obj);
            }
            final CardProductRewardNotify other = (CardProductRewardNotify)obj;
            return this.getHcoin() == other.getHcoin() && this.getProductId().equals(other.getProductId()) && this.getRemainDays() == other.getRemainDays() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getHcoin();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getProductId().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRemainDays();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CardProductRewardNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data);
        }
        
        public static CardProductRewardNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CardProductRewardNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data);
        }
        
        public static CardProductRewardNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CardProductRewardNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data);
        }
        
        public static CardProductRewardNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CardProductRewardNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CardProductRewardNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CardProductRewardNotify.PARSER, input);
        }
        
        public static CardProductRewardNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CardProductRewardNotify.PARSER, input, extensionRegistry);
        }
        
        public static CardProductRewardNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CardProductRewardNotify.PARSER, input);
        }
        
        public static CardProductRewardNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CardProductRewardNotify.PARSER, input, extensionRegistry);
        }
        
        public static CardProductRewardNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CardProductRewardNotify.PARSER, input);
        }
        
        public static CardProductRewardNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CardProductRewardNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CardProductRewardNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CardProductRewardNotify prototype) {
            return CardProductRewardNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CardProductRewardNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CardProductRewardNotify getDefaultInstance() {
            return CardProductRewardNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CardProductRewardNotify> parser() {
            return CardProductRewardNotify.PARSER;
        }
        
        @Override
        public Parser<CardProductRewardNotify> getParserForType() {
            return CardProductRewardNotify.PARSER;
        }
        
        @Override
        public CardProductRewardNotify getDefaultInstanceForType() {
            return CardProductRewardNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CardProductRewardNotify();
            PARSER = new AbstractParser<CardProductRewardNotify>() {
                @Override
                public CardProductRewardNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CardProductRewardNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardProductRewardNotifyOrBuilder
        {
            private int hcoin_;
            private Object productId_;
            private int remainDays_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CardProductRewardNotify.class, Builder.class);
            }
            
            private Builder() {
                this.productId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.productId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CardProductRewardNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.hcoin_ = 0;
                this.productId_ = "";
                this.remainDays_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
            }
            
            @Override
            public CardProductRewardNotify getDefaultInstanceForType() {
                return CardProductRewardNotify.getDefaultInstance();
            }
            
            @Override
            public CardProductRewardNotify build() {
                final CardProductRewardNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CardProductRewardNotify buildPartial() {
                final CardProductRewardNotify result = new CardProductRewardNotify(this);
                result.hcoin_ = this.hcoin_;
                result.productId_ = this.productId_;
                result.remainDays_ = this.remainDays_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof CardProductRewardNotify) {
                    return this.mergeFrom((CardProductRewardNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CardProductRewardNotify other) {
                if (other == CardProductRewardNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getHcoin() != 0) {
                    this.setHcoin(other.getHcoin());
                }
                if (!other.getProductId().isEmpty()) {
                    this.productId_ = other.productId_;
                    this.onChanged();
                }
                if (other.getRemainDays() != 0) {
                    this.setRemainDays(other.getRemainDays());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                CardProductRewardNotify parsedMessage = null;
                try {
                    parsedMessage = CardProductRewardNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CardProductRewardNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getHcoin() {
                return this.hcoin_;
            }
            
            public Builder setHcoin(final int value) {
                this.hcoin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHcoin() {
                this.hcoin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getProductId() {
                final Object ref = this.productId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.productId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getProductIdBytes() {
                final Object ref = this.productId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.productId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProductId() {
                this.productId_ = CardProductRewardNotify.getDefaultInstance().getProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRemainDays() {
                return this.remainDays_;
            }
            
            public Builder setRemainDays(final int value) {
                this.remainDays_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainDays() {
                this.remainDays_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface CardProductRewardNotifyOrBuilder extends MessageOrBuilder
    {
        int getHcoin();
        
        String getProductId();
        
        ByteString getProductIdBytes();
        
        int getRemainDays();
    }
}
