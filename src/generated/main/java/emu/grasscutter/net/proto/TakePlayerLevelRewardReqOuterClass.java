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

public final class TakePlayerLevelRewardReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakePlayerLevelRewardReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakePlayerLevelRewardReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakePlayerLevelRewardReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakePlayerLevelRewardReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eTakePlayerLevelRewardReq.proto\")\n\u0018TakePlayerLevelRewardReq\u0012\r\n\u0005level\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakePlayerLevelRewardReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakePlayerLevelRewardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakePlayerLevelRewardReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_descriptor, new String[] { "Level" });
    }
    
    public static final class TakePlayerLevelRewardReq extends GeneratedMessageV3 implements TakePlayerLevelRewardReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 3;
        private int level_;
        private byte memoizedIsInitialized;
        private static final TakePlayerLevelRewardReq DEFAULT_INSTANCE;
        private static final Parser<TakePlayerLevelRewardReq> PARSER;
        
        private TakePlayerLevelRewardReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakePlayerLevelRewardReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakePlayerLevelRewardReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakePlayerLevelRewardReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.level_ = input.readUInt32();
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
            return TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakePlayerLevelRewardReq.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
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
            if (this.level_ != 0) {
                output.writeUInt32(3, this.level_);
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
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.level_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakePlayerLevelRewardReq)) {
                return super.equals(obj);
            }
            final TakePlayerLevelRewardReq other = (TakePlayerLevelRewardReq)obj;
            return this.getLevel() == other.getLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardReq.PARSER, input);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakePlayerLevelRewardReq.PARSER, input);
        }
        
        public static TakePlayerLevelRewardReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakePlayerLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardReq.PARSER, input);
        }
        
        public static TakePlayerLevelRewardReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakePlayerLevelRewardReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakePlayerLevelRewardReq prototype) {
            return TakePlayerLevelRewardReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakePlayerLevelRewardReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakePlayerLevelRewardReq getDefaultInstance() {
            return TakePlayerLevelRewardReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakePlayerLevelRewardReq> parser() {
            return TakePlayerLevelRewardReq.PARSER;
        }
        
        @Override
        public Parser<TakePlayerLevelRewardReq> getParserForType() {
            return TakePlayerLevelRewardReq.PARSER;
        }
        
        @Override
        public TakePlayerLevelRewardReq getDefaultInstanceForType() {
            return TakePlayerLevelRewardReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakePlayerLevelRewardReq();
            PARSER = new AbstractParser<TakePlayerLevelRewardReq>() {
                @Override
                public TakePlayerLevelRewardReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakePlayerLevelRewardReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakePlayerLevelRewardReqOrBuilder
        {
            private int level_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakePlayerLevelRewardReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakePlayerLevelRewardReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakePlayerLevelRewardReqOuterClass.internal_static_TakePlayerLevelRewardReq_descriptor;
            }
            
            @Override
            public TakePlayerLevelRewardReq getDefaultInstanceForType() {
                return TakePlayerLevelRewardReq.getDefaultInstance();
            }
            
            @Override
            public TakePlayerLevelRewardReq build() {
                final TakePlayerLevelRewardReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakePlayerLevelRewardReq buildPartial() {
                final TakePlayerLevelRewardReq result = new TakePlayerLevelRewardReq(this);
                result.level_ = this.level_;
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
                if (other instanceof TakePlayerLevelRewardReq) {
                    return this.mergeFrom((TakePlayerLevelRewardReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakePlayerLevelRewardReq other) {
                if (other == TakePlayerLevelRewardReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
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
                TakePlayerLevelRewardReq parsedMessage = null;
                try {
                    parsedMessage = TakePlayerLevelRewardReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakePlayerLevelRewardReq)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
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
    
    public interface TakePlayerLevelRewardReqOrBuilder extends MessageOrBuilder
    {
        int getLevel();
    }
}
