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
import com.google.protobuf.Internal;
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

public final class CoopCgOuterClass
{
    private static final Descriptors.Descriptor internal_static_CoopCg_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CoopCg_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CoopCgOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CoopCgOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\fCoopCg.proto\"'\n\u0006CoopCg\u0012\u0011\n\tis_unlock\u0018\u000e \u0001(\b\u0012\n\n\u0002id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CoopCgOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CoopCg_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CoopCg_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CoopCgOuterClass.internal_static_CoopCg_descriptor, new String[] { "IsUnlock", "Id" });
    }
    
    public static final class CoopCg extends GeneratedMessageV3 implements CoopCgOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_UNLOCK_FIELD_NUMBER = 14;
        private boolean isUnlock_;
        public static final int ID_FIELD_NUMBER = 8;
        private int id_;
        private byte memoizedIsInitialized;
        private static final CoopCg DEFAULT_INSTANCE;
        private static final Parser<CoopCg> PARSER;
        
        private CoopCg(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CoopCg() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CoopCg();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CoopCg(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.isUnlock_ = input.readBool();
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
            return CoopCgOuterClass.internal_static_CoopCg_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CoopCgOuterClass.internal_static_CoopCg_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopCg.class, Builder.class);
        }
        
        @Override
        public boolean getIsUnlock() {
            return this.isUnlock_;
        }
        
        @Override
        public int getId() {
            return this.id_;
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
            if (this.id_ != 0) {
                output.writeUInt32(8, this.id_);
            }
            if (this.isUnlock_) {
                output.writeBool(14, this.isUnlock_);
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
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.id_);
            }
            if (this.isUnlock_) {
                size += CodedOutputStream.computeBoolSize(14, this.isUnlock_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoopCg)) {
                return super.equals(obj);
            }
            final CoopCg other = (CoopCg)obj;
            return this.getIsUnlock() == other.getIsUnlock() && this.getId() == other.getId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsUnlock());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CoopCg parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data);
        }
        
        public static CoopCg parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopCg parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data);
        }
        
        public static CoopCg parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopCg parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data);
        }
        
        public static CoopCg parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CoopCg.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CoopCg parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopCg.PARSER, input);
        }
        
        public static CoopCg parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopCg.PARSER, input, extensionRegistry);
        }
        
        public static CoopCg parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopCg.PARSER, input);
        }
        
        public static CoopCg parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CoopCg.PARSER, input, extensionRegistry);
        }
        
        public static CoopCg parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopCg.PARSER, input);
        }
        
        public static CoopCg parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CoopCg.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CoopCg.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CoopCg prototype) {
            return CoopCg.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CoopCg.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CoopCg getDefaultInstance() {
            return CoopCg.DEFAULT_INSTANCE;
        }
        
        public static Parser<CoopCg> parser() {
            return CoopCg.PARSER;
        }
        
        @Override
        public Parser<CoopCg> getParserForType() {
            return CoopCg.PARSER;
        }
        
        @Override
        public CoopCg getDefaultInstanceForType() {
            return CoopCg.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CoopCg();
            PARSER = new AbstractParser<CoopCg>() {
                @Override
                public CoopCg parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CoopCg(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoopCgOrBuilder
        {
            private boolean isUnlock_;
            private int id_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CoopCgOuterClass.internal_static_CoopCg_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CoopCgOuterClass.internal_static_CoopCg_fieldAccessorTable.ensureFieldAccessorsInitialized(CoopCg.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CoopCg.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isUnlock_ = false;
                this.id_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CoopCgOuterClass.internal_static_CoopCg_descriptor;
            }
            
            @Override
            public CoopCg getDefaultInstanceForType() {
                return CoopCg.getDefaultInstance();
            }
            
            @Override
            public CoopCg build() {
                final CoopCg result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CoopCg buildPartial() {
                final CoopCg result = new CoopCg(this);
                result.isUnlock_ = this.isUnlock_;
                result.id_ = this.id_;
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
                if (other instanceof CoopCg) {
                    return this.mergeFrom((CoopCg)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CoopCg other) {
                if (other == CoopCg.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsUnlock()) {
                    this.setIsUnlock(other.getIsUnlock());
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
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
                CoopCg parsedMessage = null;
                try {
                    parsedMessage = CoopCg.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CoopCg)e.getUnfinishedMessage();
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
            public boolean getIsUnlock() {
                return this.isUnlock_;
            }
            
            public Builder setIsUnlock(final boolean value) {
                this.isUnlock_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsUnlock() {
                this.isUnlock_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
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
    
    public interface CoopCgOrBuilder extends MessageOrBuilder
    {
        boolean getIsUnlock();
        
        int getId();
    }
}
