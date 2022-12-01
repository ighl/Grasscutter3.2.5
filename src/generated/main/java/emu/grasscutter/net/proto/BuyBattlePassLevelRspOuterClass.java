// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class BuyBattlePassLevelRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_BuyBattlePassLevelRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BuyBattlePassLevelRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BuyBattlePassLevelRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BuyBattlePassLevelRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bBuyBattlePassLevelRsp.proto\";\n\u0015BuyBattlePassLevelRsp\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005\u0012\u0011\n\tbuy_level\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BuyBattlePassLevelRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BuyBattlePassLevelRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BuyBattlePassLevelRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_descriptor, new String[] { "Retcode", "BuyLevel" });
    }
    
    public static final class BuyBattlePassLevelRsp extends GeneratedMessageV3 implements BuyBattlePassLevelRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        public static final int BUY_LEVEL_FIELD_NUMBER = 13;
        private int buyLevel_;
        private byte memoizedIsInitialized;
        private static final BuyBattlePassLevelRsp DEFAULT_INSTANCE;
        private static final Parser<BuyBattlePassLevelRsp> PARSER;
        
        private BuyBattlePassLevelRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BuyBattlePassLevelRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BuyBattlePassLevelRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BuyBattlePassLevelRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 104: {
                            this.buyLevel_ = input.readUInt32();
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
            return BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyBattlePassLevelRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getBuyLevel() {
            return this.buyLevel_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            if (this.buyLevel_ != 0) {
                output.writeUInt32(13, this.buyLevel_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            if (this.buyLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.buyLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BuyBattlePassLevelRsp)) {
                return super.equals(obj);
            }
            final BuyBattlePassLevelRsp other = (BuyBattlePassLevelRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getBuyLevel() == other.getBuyLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getBuyLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyBattlePassLevelRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyBattlePassLevelRsp.PARSER, input);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyBattlePassLevelRsp.PARSER, input, extensionRegistry);
        }
        
        public static BuyBattlePassLevelRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyBattlePassLevelRsp.PARSER, input);
        }
        
        public static BuyBattlePassLevelRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyBattlePassLevelRsp.PARSER, input, extensionRegistry);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyBattlePassLevelRsp.PARSER, input);
        }
        
        public static BuyBattlePassLevelRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyBattlePassLevelRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BuyBattlePassLevelRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BuyBattlePassLevelRsp prototype) {
            return BuyBattlePassLevelRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BuyBattlePassLevelRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BuyBattlePassLevelRsp getDefaultInstance() {
            return BuyBattlePassLevelRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<BuyBattlePassLevelRsp> parser() {
            return BuyBattlePassLevelRsp.PARSER;
        }
        
        @Override
        public Parser<BuyBattlePassLevelRsp> getParserForType() {
            return BuyBattlePassLevelRsp.PARSER;
        }
        
        @Override
        public BuyBattlePassLevelRsp getDefaultInstanceForType() {
            return BuyBattlePassLevelRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BuyBattlePassLevelRsp();
            PARSER = new AbstractParser<BuyBattlePassLevelRsp>() {
                @Override
                public BuyBattlePassLevelRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BuyBattlePassLevelRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BuyBattlePassLevelRspOrBuilder
        {
            private int retcode_;
            private int buyLevel_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyBattlePassLevelRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BuyBattlePassLevelRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.buyLevel_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BuyBattlePassLevelRspOuterClass.internal_static_BuyBattlePassLevelRsp_descriptor;
            }
            
            @Override
            public BuyBattlePassLevelRsp getDefaultInstanceForType() {
                return BuyBattlePassLevelRsp.getDefaultInstance();
            }
            
            @Override
            public BuyBattlePassLevelRsp build() {
                final BuyBattlePassLevelRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BuyBattlePassLevelRsp buildPartial() {
                final BuyBattlePassLevelRsp result = new BuyBattlePassLevelRsp(this);
                result.retcode_ = this.retcode_;
                result.buyLevel_ = this.buyLevel_;
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
                if (other instanceof BuyBattlePassLevelRsp) {
                    return this.mergeFrom((BuyBattlePassLevelRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BuyBattlePassLevelRsp other) {
                if (other == BuyBattlePassLevelRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getBuyLevel() != 0) {
                    this.setBuyLevel(other.getBuyLevel());
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
                BuyBattlePassLevelRsp parsedMessage = null;
                try {
                    parsedMessage = BuyBattlePassLevelRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BuyBattlePassLevelRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBuyLevel() {
                return this.buyLevel_;
            }
            
            public Builder setBuyLevel(final int value) {
                this.buyLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBuyLevel() {
                this.buyLevel_ = 0;
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
    
    public interface BuyBattlePassLevelRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getBuyLevel();
    }
}
