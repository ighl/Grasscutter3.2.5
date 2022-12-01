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

public final class CutSceneBeginNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CutSceneBeginNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CutSceneBeginNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CutSceneBeginNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CutSceneBeginNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019CutSceneBeginNotify.proto\"B\n\u0013CutSceneBeginNotify\u0012\u0013\n\u000bcutscene_id\u0018\u000e \u0001(\r\u0012\u0016\n\u000eis_wait_others\u0018\t \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CutSceneBeginNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CutSceneBeginNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CutSceneBeginNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor, new String[] { "CutsceneId", "IsWaitOthers" });
    }
    
    public static final class CutSceneBeginNotify extends GeneratedMessageV3 implements CutSceneBeginNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUTSCENE_ID_FIELD_NUMBER = 14;
        private int cutsceneId_;
        public static final int IS_WAIT_OTHERS_FIELD_NUMBER = 9;
        private boolean isWaitOthers_;
        private byte memoizedIsInitialized;
        private static final CutSceneBeginNotify DEFAULT_INSTANCE;
        private static final Parser<CutSceneBeginNotify> PARSER;
        
        private CutSceneBeginNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CutSceneBeginNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CutSceneBeginNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CutSceneBeginNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.isWaitOthers_ = input.readBool();
                            continue;
                        }
                        case 112: {
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
            return CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CutSceneBeginNotify.class, Builder.class);
        }
        
        @Override
        public int getCutsceneId() {
            return this.cutsceneId_;
        }
        
        @Override
        public boolean getIsWaitOthers() {
            return this.isWaitOthers_;
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
            if (this.isWaitOthers_) {
                output.writeBool(9, this.isWaitOthers_);
            }
            if (this.cutsceneId_ != 0) {
                output.writeUInt32(14, this.cutsceneId_);
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
            if (this.isWaitOthers_) {
                size += CodedOutputStream.computeBoolSize(9, this.isWaitOthers_);
            }
            if (this.cutsceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.cutsceneId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CutSceneBeginNotify)) {
                return super.equals(obj);
            }
            final CutSceneBeginNotify other = (CutSceneBeginNotify)obj;
            return this.getCutsceneId() == other.getCutsceneId() && this.getIsWaitOthers() == other.getIsWaitOthers() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getCutsceneId();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsWaitOthers());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CutSceneBeginNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneBeginNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneBeginNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneBeginNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneBeginNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data);
        }
        
        public static CutSceneBeginNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CutSceneBeginNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CutSceneBeginNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneBeginNotify.PARSER, input);
        }
        
        public static CutSceneBeginNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static CutSceneBeginNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CutSceneBeginNotify.PARSER, input);
        }
        
        public static CutSceneBeginNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CutSceneBeginNotify.PARSER, input, extensionRegistry);
        }
        
        public static CutSceneBeginNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneBeginNotify.PARSER, input);
        }
        
        public static CutSceneBeginNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CutSceneBeginNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CutSceneBeginNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CutSceneBeginNotify prototype) {
            return CutSceneBeginNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CutSceneBeginNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CutSceneBeginNotify getDefaultInstance() {
            return CutSceneBeginNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CutSceneBeginNotify> parser() {
            return CutSceneBeginNotify.PARSER;
        }
        
        @Override
        public Parser<CutSceneBeginNotify> getParserForType() {
            return CutSceneBeginNotify.PARSER;
        }
        
        @Override
        public CutSceneBeginNotify getDefaultInstanceForType() {
            return CutSceneBeginNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CutSceneBeginNotify();
            PARSER = new AbstractParser<CutSceneBeginNotify>() {
                @Override
                public CutSceneBeginNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CutSceneBeginNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CutSceneBeginNotifyOrBuilder
        {
            private int cutsceneId_;
            private boolean isWaitOthers_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CutSceneBeginNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CutSceneBeginNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cutsceneId_ = 0;
                this.isWaitOthers_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CutSceneBeginNotifyOuterClass.internal_static_CutSceneBeginNotify_descriptor;
            }
            
            @Override
            public CutSceneBeginNotify getDefaultInstanceForType() {
                return CutSceneBeginNotify.getDefaultInstance();
            }
            
            @Override
            public CutSceneBeginNotify build() {
                final CutSceneBeginNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CutSceneBeginNotify buildPartial() {
                final CutSceneBeginNotify result = new CutSceneBeginNotify(this);
                result.cutsceneId_ = this.cutsceneId_;
                result.isWaitOthers_ = this.isWaitOthers_;
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
                if (other instanceof CutSceneBeginNotify) {
                    return this.mergeFrom((CutSceneBeginNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CutSceneBeginNotify other) {
                if (other == CutSceneBeginNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCutsceneId() != 0) {
                    this.setCutsceneId(other.getCutsceneId());
                }
                if (other.getIsWaitOthers()) {
                    this.setIsWaitOthers(other.getIsWaitOthers());
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
                CutSceneBeginNotify parsedMessage = null;
                try {
                    parsedMessage = CutSceneBeginNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CutSceneBeginNotify)e.getUnfinishedMessage();
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
            public boolean getIsWaitOthers() {
                return this.isWaitOthers_;
            }
            
            public Builder setIsWaitOthers(final boolean value) {
                this.isWaitOthers_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsWaitOthers() {
                this.isWaitOthers_ = false;
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
    
    public interface CutSceneBeginNotifyOrBuilder extends MessageOrBuilder
    {
        int getCutsceneId();
        
        boolean getIsWaitOthers();
    }
}
