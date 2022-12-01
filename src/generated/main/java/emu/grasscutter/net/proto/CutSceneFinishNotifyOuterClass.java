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

public final class CutSceneFinishNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CutSceneFinishNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CutSceneFinishNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CutSceneFinishNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CutSceneFinishNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCutSceneFinishNotify.proto\"+\n\u0014CutSceneFinishNotify\u0012\u0013\n\u000bcutscene_id\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CutSceneFinishNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CutSceneFinishNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CutSceneFinishNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor, new String[] { "CutsceneId" });
    }
    
    public static final class CutSceneFinishNotify extends GeneratedMessageV3 implements CutSceneFinishNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUTSCENE_ID_FIELD_NUMBER = 12;
        private int cutsceneId_;
        private byte memoizedIsInitialized;
        private static final CutSceneFinishNotify DEFAULT_INSTANCE;
        private static final Parser<CutSceneFinishNotify> PARSER;
        
        private CutSceneFinishNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CutSceneFinishNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CutSceneFinishNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CutSceneFinishNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            this.cutsceneId_ = input.readUInt32();
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
            return CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CutSceneFinishNotify.class, Builder.class);
        }
        
        @Override
        public int getCutsceneId() {
            return this.cutsceneId_;
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
            if (this.cutsceneId_ != 0) {
                output.writeUInt32(12, this.cutsceneId_);
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
            if (this.cutsceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.cutsceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CutSceneFinishNotify)) {
                return super.equals(obj);
            }
            final CutSceneFinishNotify other = (CutSceneFinishNotify)obj;
            return this.getCutsceneId() == other.getCutsceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCutsceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CutSceneFinishNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneFinishNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneFinishNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneFinishNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneFinishNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneFinishNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneFinishNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneFinishNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneFinishNotify.PARSER, input);
        }
        
        public static CutSceneFinishNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneFinishNotify.PARSER, input, extensionRegistry);
        }
        
        public static CutSceneFinishNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CutSceneFinishNotify.PARSER, input);
        }
        
        public static CutSceneFinishNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CutSceneFinishNotify.PARSER, input, extensionRegistry);
        }
        
        public static CutSceneFinishNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneFinishNotify.PARSER, input);
        }
        
        public static CutSceneFinishNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneFinishNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CutSceneFinishNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CutSceneFinishNotify prototype) {
            return CutSceneFinishNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CutSceneFinishNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CutSceneFinishNotify getDefaultInstance() {
            return CutSceneFinishNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CutSceneFinishNotify> parser() {
            return CutSceneFinishNotify.PARSER;
        }
        
        @Override
        public Parser<CutSceneFinishNotify> getParserForType() {
            return CutSceneFinishNotify.PARSER;
        }
        
        @Override
        public CutSceneFinishNotify getDefaultInstanceForType() {
            return CutSceneFinishNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CutSceneFinishNotify();
            PARSER = new AbstractParser<CutSceneFinishNotify>() {
                @Override
                public CutSceneFinishNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CutSceneFinishNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CutSceneFinishNotifyOrBuilder
        {
            private int cutsceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CutSceneFinishNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CutSceneFinishNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cutsceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
            }
            
            @Override
            public CutSceneFinishNotify getDefaultInstanceForType() {
                return CutSceneFinishNotify.getDefaultInstance();
            }
            
            @Override
            public CutSceneFinishNotify build() {
                final CutSceneFinishNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CutSceneFinishNotify buildPartial() {
                final CutSceneFinishNotify result = new CutSceneFinishNotify(this);
                result.cutsceneId_ = this.cutsceneId_;
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
                if (other instanceof CutSceneFinishNotify) {
                    return this.mergeFrom((CutSceneFinishNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CutSceneFinishNotify other) {
                if (other == CutSceneFinishNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCutsceneId() != 0) {
                    this.setCutsceneId(other.getCutsceneId());
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
                CutSceneFinishNotify parsedMessage = null;
                try {
                    parsedMessage = CutSceneFinishNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CutSceneFinishNotify)e.getUnfinishedMessage();
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
            public int getCutsceneId() {
                return this.cutsceneId_;
            }
            
            public Builder setCutsceneId(final int value) {
                this.cutsceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCutsceneId() {
                this.cutsceneId_ = 0;
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
    
    public interface CutSceneFinishNotifyOrBuilder extends MessageOrBuilder
    {
        int getCutsceneId();
    }
}
