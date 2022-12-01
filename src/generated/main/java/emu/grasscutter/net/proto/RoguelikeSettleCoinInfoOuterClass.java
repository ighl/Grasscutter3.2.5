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

public final class RoguelikeSettleCoinInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RoguelikeSettleCoinInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RoguelikeSettleCoinInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RoguelikeSettleCoinInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dRoguelikeSettleCoinInfo.proto\"K\n\u0017RoguelikeSettleCoinInfo\u0012\u000e\n\u0006coin_c\u0018\b \u0001(\r\u0012\u000e\n\u0006coin_b\u0018\n \u0001(\r\u0012\u0010\n\bcell_num\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RoguelikeSettleCoinInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_RoguelikeSettleCoinInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor, new String[] { "CoinC", "CoinB", "CellNum" });
    }
    
    public static final class RoguelikeSettleCoinInfo extends GeneratedMessageV3 implements RoguelikeSettleCoinInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COIN_C_FIELD_NUMBER = 8;
        private int coinC_;
        public static final int COIN_B_FIELD_NUMBER = 10;
        private int coinB_;
        public static final int CELL_NUM_FIELD_NUMBER = 1;
        private int cellNum_;
        private byte memoizedIsInitialized;
        private static final RoguelikeSettleCoinInfo DEFAULT_INSTANCE;
        private static final Parser<RoguelikeSettleCoinInfo> PARSER;
        
        private RoguelikeSettleCoinInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RoguelikeSettleCoinInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RoguelikeSettleCoinInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RoguelikeSettleCoinInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.cellNum_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.coinC_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.coinB_ = input.readUInt32();
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
            return RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeSettleCoinInfo.class, Builder.class);
        }
        
        @Override
        public int getCoinC() {
            return this.coinC_;
        }
        
        @Override
        public int getCoinB() {
            return this.coinB_;
        }
        
        @Override
        public int getCellNum() {
            return this.cellNum_;
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
            if (this.cellNum_ != 0) {
                output.writeUInt32(1, this.cellNum_);
            }
            if (this.coinC_ != 0) {
                output.writeUInt32(8, this.coinC_);
            }
            if (this.coinB_ != 0) {
                output.writeUInt32(10, this.coinB_);
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
            if (this.cellNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.cellNum_);
            }
            if (this.coinC_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.coinC_);
            }
            if (this.coinB_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.coinB_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoguelikeSettleCoinInfo)) {
                return super.equals(obj);
            }
            final RoguelikeSettleCoinInfo other = (RoguelikeSettleCoinInfo)obj;
            return this.getCoinC() == other.getCoinC() && this.getCoinB() == other.getCoinB() && this.getCellNum() == other.getCellNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getCoinC();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getCoinB();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCellNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RoguelikeSettleCoinInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeSettleCoinInfo.PARSER, input);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeSettleCoinInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeSettleCoinInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeSettleCoinInfo.PARSER, input);
        }
        
        public static RoguelikeSettleCoinInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RoguelikeSettleCoinInfo.PARSER, input, extensionRegistry);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeSettleCoinInfo.PARSER, input);
        }
        
        public static RoguelikeSettleCoinInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RoguelikeSettleCoinInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RoguelikeSettleCoinInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RoguelikeSettleCoinInfo prototype) {
            return RoguelikeSettleCoinInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RoguelikeSettleCoinInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RoguelikeSettleCoinInfo getDefaultInstance() {
            return RoguelikeSettleCoinInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RoguelikeSettleCoinInfo> parser() {
            return RoguelikeSettleCoinInfo.PARSER;
        }
        
        @Override
        public Parser<RoguelikeSettleCoinInfo> getParserForType() {
            return RoguelikeSettleCoinInfo.PARSER;
        }
        
        @Override
        public RoguelikeSettleCoinInfo getDefaultInstanceForType() {
            return RoguelikeSettleCoinInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RoguelikeSettleCoinInfo();
            PARSER = new AbstractParser<RoguelikeSettleCoinInfo>() {
                @Override
                public RoguelikeSettleCoinInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RoguelikeSettleCoinInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoguelikeSettleCoinInfoOrBuilder
        {
            private int coinC_;
            private int coinB_;
            private int cellNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoguelikeSettleCoinInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RoguelikeSettleCoinInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.coinC_ = 0;
                this.coinB_ = 0;
                this.cellNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RoguelikeSettleCoinInfoOuterClass.internal_static_RoguelikeSettleCoinInfo_descriptor;
            }
            
            @Override
            public RoguelikeSettleCoinInfo getDefaultInstanceForType() {
                return RoguelikeSettleCoinInfo.getDefaultInstance();
            }
            
            @Override
            public RoguelikeSettleCoinInfo build() {
                final RoguelikeSettleCoinInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RoguelikeSettleCoinInfo buildPartial() {
                final RoguelikeSettleCoinInfo result = new RoguelikeSettleCoinInfo(this);
                result.coinC_ = this.coinC_;
                result.coinB_ = this.coinB_;
                result.cellNum_ = this.cellNum_;
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
                if (other instanceof RoguelikeSettleCoinInfo) {
                    return this.mergeFrom((RoguelikeSettleCoinInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RoguelikeSettleCoinInfo other) {
                if (other == RoguelikeSettleCoinInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCoinC() != 0) {
                    this.setCoinC(other.getCoinC());
                }
                if (other.getCoinB() != 0) {
                    this.setCoinB(other.getCoinB());
                }
                if (other.getCellNum() != 0) {
                    this.setCellNum(other.getCellNum());
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
                RoguelikeSettleCoinInfo parsedMessage = null;
                try {
                    parsedMessage = RoguelikeSettleCoinInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RoguelikeSettleCoinInfo)e.getUnfinishedMessage();
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
            public int getCoinC() {
                return this.coinC_;
            }
            
            public Builder setCoinC(final int value) {
                this.coinC_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCoinC() {
                this.coinC_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCoinB() {
                return this.coinB_;
            }
            
            public Builder setCoinB(final int value) {
                this.coinB_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCoinB() {
                this.coinB_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCellNum() {
                return this.cellNum_;
            }
            
            public Builder setCellNum(final int value) {
                this.cellNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCellNum() {
                this.cellNum_ = 0;
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
    
    public interface RoguelikeSettleCoinInfoOrBuilder extends MessageOrBuilder
    {
        int getCoinC();
        
        int getCoinB();
        
        int getCellNum();
    }
}
