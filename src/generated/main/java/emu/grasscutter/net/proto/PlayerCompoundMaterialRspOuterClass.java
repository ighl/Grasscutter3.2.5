// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class PlayerCompoundMaterialRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerCompoundMaterialRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerCompoundMaterialRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerCompoundMaterialRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fPlayerCompoundMaterialRsp.proto\u001a\u0017CompoundQueueData.proto\"[\n\u0019PlayerCompoundMaterialRsp\u0012-\n\u0011compound_que_data\u0018\u0005 \u0001(\u000b2\u0012.CompoundQueueData\u0012\u000f\n\u0007retcode\u0018\f \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerCompoundMaterialRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CompoundQueueDataOuterClass.getDescriptor() });
        internal_static_PlayerCompoundMaterialRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor, new String[] { "CompoundQueData", "Retcode" });
        CompoundQueueDataOuterClass.getDescriptor();
    }
    
    public static final class PlayerCompoundMaterialRsp extends GeneratedMessageV3 implements PlayerCompoundMaterialRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMPOUND_QUE_DATA_FIELD_NUMBER = 5;
        private CompoundQueueDataOuterClass.CompoundQueueData compoundQueData_;
        public static final int RETCODE_FIELD_NUMBER = 12;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final PlayerCompoundMaterialRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerCompoundMaterialRsp> PARSER;
        
        private PlayerCompoundMaterialRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerCompoundMaterialRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerCompoundMaterialRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerCompoundMaterialRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            CompoundQueueDataOuterClass.CompoundQueueData.Builder subBuilder = null;
                            if (this.compoundQueData_ != null) {
                                subBuilder = this.compoundQueData_.toBuilder();
                            }
                            this.compoundQueData_ = input.readMessage(CompoundQueueDataOuterClass.CompoundQueueData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.compoundQueData_);
                                this.compoundQueData_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 96: {
                            this.retcode_ = input.readInt32();
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
            return PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCompoundMaterialRsp.class, Builder.class);
        }
        
        @Override
        public boolean hasCompoundQueData() {
            return this.compoundQueData_ != null;
        }
        
        @Override
        public CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueData() {
            return (this.compoundQueData_ == null) ? CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : this.compoundQueData_;
        }
        
        @Override
        public CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataOrBuilder() {
            return this.getCompoundQueData();
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.compoundQueData_ != null) {
                output.writeMessage(5, this.getCompoundQueData());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(12, this.retcode_);
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
            if (this.compoundQueData_ != null) {
                size += CodedOutputStream.computeMessageSize(5, this.getCompoundQueData());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(12, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerCompoundMaterialRsp)) {
                return super.equals(obj);
            }
            final PlayerCompoundMaterialRsp other = (PlayerCompoundMaterialRsp)obj;
            return this.hasCompoundQueData() == other.hasCompoundQueData() && (!this.hasCompoundQueData() || this.getCompoundQueData().equals(other.getCompoundQueData())) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCompoundQueData()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getCompoundQueData().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCompoundMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCompoundMaterialRsp.PARSER, input);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCompoundMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCompoundMaterialRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCompoundMaterialRsp.PARSER, input);
        }
        
        public static PlayerCompoundMaterialRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCompoundMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCompoundMaterialRsp.PARSER, input);
        }
        
        public static PlayerCompoundMaterialRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCompoundMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerCompoundMaterialRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerCompoundMaterialRsp prototype) {
            return PlayerCompoundMaterialRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerCompoundMaterialRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerCompoundMaterialRsp getDefaultInstance() {
            return PlayerCompoundMaterialRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerCompoundMaterialRsp> parser() {
            return PlayerCompoundMaterialRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerCompoundMaterialRsp> getParserForType() {
            return PlayerCompoundMaterialRsp.PARSER;
        }
        
        @Override
        public PlayerCompoundMaterialRsp getDefaultInstanceForType() {
            return PlayerCompoundMaterialRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerCompoundMaterialRsp();
            PARSER = new AbstractParser<PlayerCompoundMaterialRsp>() {
                @Override
                public PlayerCompoundMaterialRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerCompoundMaterialRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerCompoundMaterialRspOrBuilder
        {
            private CompoundQueueDataOuterClass.CompoundQueueData compoundQueData_;
            private SingleFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> compoundQueDataBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCompoundMaterialRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerCompoundMaterialRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.compoundQueDataBuilder_ == null) {
                    this.compoundQueData_ = null;
                }
                else {
                    this.compoundQueData_ = null;
                    this.compoundQueDataBuilder_ = null;
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
            }
            
            @Override
            public PlayerCompoundMaterialRsp getDefaultInstanceForType() {
                return PlayerCompoundMaterialRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerCompoundMaterialRsp build() {
                final PlayerCompoundMaterialRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerCompoundMaterialRsp buildPartial() {
                final PlayerCompoundMaterialRsp result = new PlayerCompoundMaterialRsp(this);
                if (this.compoundQueDataBuilder_ == null) {
                    result.compoundQueData_ = this.compoundQueData_;
                }
                else {
                    result.compoundQueData_ = this.compoundQueDataBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof PlayerCompoundMaterialRsp) {
                    return this.mergeFrom((PlayerCompoundMaterialRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerCompoundMaterialRsp other) {
                if (other == PlayerCompoundMaterialRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.hasCompoundQueData()) {
                    this.mergeCompoundQueData(other.getCompoundQueData());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                PlayerCompoundMaterialRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerCompoundMaterialRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerCompoundMaterialRsp)e.getUnfinishedMessage();
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
            public boolean hasCompoundQueData() {
                return this.compoundQueDataBuilder_ != null || this.compoundQueData_ != null;
            }
            
            @Override
            public CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueData() {
                if (this.compoundQueDataBuilder_ == null) {
                    return (this.compoundQueData_ == null) ? CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : this.compoundQueData_;
                }
                return this.compoundQueDataBuilder_.getMessage();
            }
            
            public Builder setCompoundQueData(final CompoundQueueDataOuterClass.CompoundQueueData value) {
                if (this.compoundQueDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.compoundQueData_ = value;
                    this.onChanged();
                }
                else {
                    this.compoundQueDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setCompoundQueData(final CompoundQueueDataOuterClass.CompoundQueueData.Builder builderForValue) {
                if (this.compoundQueDataBuilder_ == null) {
                    this.compoundQueData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.compoundQueDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeCompoundQueData(final CompoundQueueDataOuterClass.CompoundQueueData value) {
                if (this.compoundQueDataBuilder_ == null) {
                    if (this.compoundQueData_ != null) {
                        this.compoundQueData_ = CompoundQueueDataOuterClass.CompoundQueueData.newBuilder(this.compoundQueData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.compoundQueData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.compoundQueDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearCompoundQueData() {
                if (this.compoundQueDataBuilder_ == null) {
                    this.compoundQueData_ = null;
                    this.onChanged();
                }
                else {
                    this.compoundQueData_ = null;
                    this.compoundQueDataBuilder_ = null;
                }
                return this;
            }
            
            public CompoundQueueDataOuterClass.CompoundQueueData.Builder getCompoundQueDataBuilder() {
                this.onChanged();
                return this.getCompoundQueDataFieldBuilder().getBuilder();
            }
            
            @Override
            public CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataOrBuilder() {
                if (this.compoundQueDataBuilder_ != null) {
                    return this.compoundQueDataBuilder_.getMessageOrBuilder();
                }
                return (this.compoundQueData_ == null) ? CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : this.compoundQueData_;
            }
            
            private SingleFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> getCompoundQueDataFieldBuilder() {
                if (this.compoundQueDataBuilder_ == null) {
                    this.compoundQueDataBuilder_ = new SingleFieldBuilderV3<CompoundQueueDataOuterClass.CompoundQueueData, CompoundQueueDataOuterClass.CompoundQueueData.Builder, CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder>(this.getCompoundQueData(), this.getParentForChildren(), this.isClean());
                    this.compoundQueData_ = null;
                }
                return this.compoundQueDataBuilder_;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PlayerCompoundMaterialRspOrBuilder extends MessageOrBuilder
    {
        boolean hasCompoundQueData();
        
        CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueData();
        
        CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueDataOrBuilder();
        
        int getRetcode();
    }
}
