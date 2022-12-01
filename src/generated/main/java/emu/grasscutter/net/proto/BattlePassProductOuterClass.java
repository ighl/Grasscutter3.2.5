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

public final class BattlePassProductOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassProduct_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassProduct_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassProductOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassProductOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017BattlePassProduct.proto\"d\n\u0011BattlePassProduct\u0012\u0019\n\u0011normal_product_id\u0018\r \u0001(\t\u0012\u0018\n\u0010extra_product_id\u0018\n \u0001(\t\u0012\u001a\n\u0012upgrade_product_id\u0018\u0006 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassProductOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BattlePassProduct_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassProduct_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor, new String[] { "NormalProductId", "ExtraProductId", "UpgradeProductId" });
    }
    
    public static final class BattlePassProduct extends GeneratedMessageV3 implements BattlePassProductOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NORMAL_PRODUCT_ID_FIELD_NUMBER = 13;
        private volatile Object normalProductId_;
        public static final int EXTRA_PRODUCT_ID_FIELD_NUMBER = 10;
        private volatile Object extraProductId_;
        public static final int UPGRADE_PRODUCT_ID_FIELD_NUMBER = 6;
        private volatile Object upgradeProductId_;
        private byte memoizedIsInitialized;
        private static final BattlePassProduct DEFAULT_INSTANCE;
        private static final Parser<BattlePassProduct> PARSER;
        
        private BattlePassProduct(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassProduct() {
            this.memoizedIsInitialized = -1;
            this.normalProductId_ = "";
            this.extraProductId_ = "";
            this.upgradeProductId_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassProduct();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassProduct(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 50: {
                            final String s = input.readStringRequireUtf8();
                            this.upgradeProductId_ = s;
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.extraProductId_ = s;
                            continue;
                        }
                        case 106: {
                            final String s = input.readStringRequireUtf8();
                            this.normalProductId_ = s;
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
            return BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassProduct.class, Builder.class);
        }
        
        @Override
        public String getNormalProductId() {
            final Object ref = this.normalProductId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.normalProductId_ = s);
        }
        
        @Override
        public ByteString getNormalProductIdBytes() {
            final Object ref = this.normalProductId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.normalProductId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getExtraProductId() {
            final Object ref = this.extraProductId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.extraProductId_ = s);
        }
        
        @Override
        public ByteString getExtraProductIdBytes() {
            final Object ref = this.extraProductId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.extraProductId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getUpgradeProductId() {
            final Object ref = this.upgradeProductId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.upgradeProductId_ = s);
        }
        
        @Override
        public ByteString getUpgradeProductIdBytes() {
            final Object ref = this.upgradeProductId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.upgradeProductId_ = b);
            }
            return (ByteString)ref;
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
            if (!GeneratedMessageV3.isStringEmpty(this.upgradeProductId_)) {
                GeneratedMessageV3.writeString(output, 6, this.upgradeProductId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.extraProductId_)) {
                GeneratedMessageV3.writeString(output, 10, this.extraProductId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.normalProductId_)) {
                GeneratedMessageV3.writeString(output, 13, this.normalProductId_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.upgradeProductId_)) {
                size += GeneratedMessageV3.computeStringSize(6, this.upgradeProductId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.extraProductId_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.extraProductId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.normalProductId_)) {
                size += GeneratedMessageV3.computeStringSize(13, this.normalProductId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassProduct)) {
                return super.equals(obj);
            }
            final BattlePassProduct other = (BattlePassProduct)obj;
            return this.getNormalProductId().equals(other.getNormalProductId()) && this.getExtraProductId().equals(other.getExtraProductId()) && this.getUpgradeProductId().equals(other.getUpgradeProductId()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getNormalProductId().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getExtraProductId().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getUpgradeProductId().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassProduct parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data);
        }
        
        public static BattlePassProduct parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassProduct parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data);
        }
        
        public static BattlePassProduct parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassProduct parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data);
        }
        
        public static BattlePassProduct parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassProduct parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassProduct.PARSER, input);
        }
        
        public static BattlePassProduct parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassProduct.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassProduct parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassProduct.PARSER, input);
        }
        
        public static BattlePassProduct parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassProduct.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassProduct parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassProduct.PARSER, input);
        }
        
        public static BattlePassProduct parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassProduct.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassProduct.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassProduct prototype) {
            return BattlePassProduct.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassProduct.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassProduct getDefaultInstance() {
            return BattlePassProduct.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassProduct> parser() {
            return BattlePassProduct.PARSER;
        }
        
        @Override
        public Parser<BattlePassProduct> getParserForType() {
            return BattlePassProduct.PARSER;
        }
        
        @Override
        public BattlePassProduct getDefaultInstanceForType() {
            return BattlePassProduct.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassProduct();
            PARSER = new AbstractParser<BattlePassProduct>() {
                @Override
                public BattlePassProduct parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassProduct(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassProductOrBuilder
        {
            private Object normalProductId_;
            private Object extraProductId_;
            private Object upgradeProductId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassProduct.class, Builder.class);
            }
            
            private Builder() {
                this.normalProductId_ = "";
                this.extraProductId_ = "";
                this.upgradeProductId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.normalProductId_ = "";
                this.extraProductId_ = "";
                this.upgradeProductId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassProduct.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.normalProductId_ = "";
                this.extraProductId_ = "";
                this.upgradeProductId_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
            }
            
            @Override
            public BattlePassProduct getDefaultInstanceForType() {
                return BattlePassProduct.getDefaultInstance();
            }
            
            @Override
            public BattlePassProduct build() {
                final BattlePassProduct result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassProduct buildPartial() {
                final BattlePassProduct result = new BattlePassProduct(this);
                result.normalProductId_ = this.normalProductId_;
                result.extraProductId_ = this.extraProductId_;
                result.upgradeProductId_ = this.upgradeProductId_;
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
                if (other instanceof BattlePassProduct) {
                    return this.mergeFrom((BattlePassProduct)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassProduct other) {
                if (other == BattlePassProduct.getDefaultInstance()) {
                    return this;
                }
                if (!other.getNormalProductId().isEmpty()) {
                    this.normalProductId_ = other.normalProductId_;
                    this.onChanged();
                }
                if (!other.getExtraProductId().isEmpty()) {
                    this.extraProductId_ = other.extraProductId_;
                    this.onChanged();
                }
                if (!other.getUpgradeProductId().isEmpty()) {
                    this.upgradeProductId_ = other.upgradeProductId_;
                    this.onChanged();
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
                BattlePassProduct parsedMessage = null;
                try {
                    parsedMessage = BattlePassProduct.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassProduct)e.getUnfinishedMessage();
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
            public String getNormalProductId() {
                final Object ref = this.normalProductId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.normalProductId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNormalProductIdBytes() {
                final Object ref = this.normalProductId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.normalProductId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setNormalProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.normalProductId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNormalProductId() {
                this.normalProductId_ = BattlePassProduct.getDefaultInstance().getNormalProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setNormalProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.normalProductId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getExtraProductId() {
                final Object ref = this.extraProductId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.extraProductId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getExtraProductIdBytes() {
                final Object ref = this.extraProductId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.extraProductId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setExtraProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.extraProductId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExtraProductId() {
                this.extraProductId_ = BattlePassProduct.getDefaultInstance().getExtraProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setExtraProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.extraProductId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getUpgradeProductId() {
                final Object ref = this.upgradeProductId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.upgradeProductId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getUpgradeProductIdBytes() {
                final Object ref = this.upgradeProductId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.upgradeProductId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setUpgradeProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.upgradeProductId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUpgradeProductId() {
                this.upgradeProductId_ = BattlePassProduct.getDefaultInstance().getUpgradeProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setUpgradeProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.upgradeProductId_ = value;
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
    
    public interface BattlePassProductOrBuilder extends MessageOrBuilder
    {
        String getNormalProductId();
        
        ByteString getNormalProductIdBytes();
        
        String getExtraProductId();
        
        ByteString getExtraProductIdBytes();
        
        String getUpgradeProductId();
        
        ByteString getUpgradeProductIdBytes();
    }
}
