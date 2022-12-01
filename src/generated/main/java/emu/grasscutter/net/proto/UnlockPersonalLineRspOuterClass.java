// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;
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

public final class UnlockPersonalLineRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_UnlockPersonalLineRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UnlockPersonalLineRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UnlockPersonalLineRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UnlockPersonalLineRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bUnlockPersonalLineRsp.proto\"r\n\u0015UnlockPersonalLineRsp\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005\u0012\u0018\n\u0010personal_line_id\u0018\n \u0001(\r\u0012\u000f\n\u0005level\u0018\u000b \u0001(\rH\u0000\u0012\u0014\n\nchapter_id\u0018\u0006 \u0001(\rH\u0000B\u0007\n\u0005paramB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UnlockPersonalLineRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UnlockPersonalLineRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UnlockPersonalLineRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor, new String[] { "Retcode", "PersonalLineId", "Level", "ChapterId", "Param" });
    }
    
    public static final class UnlockPersonalLineRsp extends GeneratedMessageV3 implements UnlockPersonalLineRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int paramCase_;
        private Object param_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        public static final int PERSONAL_LINE_ID_FIELD_NUMBER = 10;
        private int personalLineId_;
        public static final int LEVEL_FIELD_NUMBER = 11;
        public static final int CHAPTER_ID_FIELD_NUMBER = 6;
        private byte memoizedIsInitialized;
        private static final UnlockPersonalLineRsp DEFAULT_INSTANCE;
        private static final Parser<UnlockPersonalLineRsp> PARSER;
        
        private UnlockPersonalLineRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private UnlockPersonalLineRsp() {
            this.paramCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UnlockPersonalLineRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UnlockPersonalLineRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.paramCase_ = 6;
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.personalLineId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.paramCase_ = 11;
                            this.param_ = input.readUInt32();
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
            return UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockPersonalLineRsp.class, Builder.class);
        }
        
        @Override
        public ParamCase getParamCase() {
            return ParamCase.forNumber(this.paramCase_);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getPersonalLineId() {
            return this.personalLineId_;
        }
        
        @Override
        public boolean hasLevel() {
            return this.paramCase_ == 11;
        }
        
        @Override
        public int getLevel() {
            if (this.paramCase_ == 11) {
                return (int)this.param_;
            }
            return 0;
        }
        
        @Override
        public boolean hasChapterId() {
            return this.paramCase_ == 6;
        }
        
        @Override
        public int getChapterId() {
            if (this.paramCase_ == 6) {
                return (int)this.param_;
            }
            return 0;
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
                output.writeInt32(4, this.retcode_);
            }
            if (this.paramCase_ == 6) {
                output.writeUInt32(6, (int)this.param_);
            }
            if (this.personalLineId_ != 0) {
                output.writeUInt32(10, this.personalLineId_);
            }
            if (this.paramCase_ == 11) {
                output.writeUInt32(11, (int)this.param_);
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
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.paramCase_ == 6) {
                size += CodedOutputStream.computeUInt32Size(6, (int)this.param_);
            }
            if (this.personalLineId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.personalLineId_);
            }
            if (this.paramCase_ == 11) {
                size += CodedOutputStream.computeUInt32Size(11, (int)this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockPersonalLineRsp)) {
                return super.equals(obj);
            }
            final UnlockPersonalLineRsp other = (UnlockPersonalLineRsp)obj;
            if (this.getRetcode() != other.getRetcode()) {
                return false;
            }
            if (this.getPersonalLineId() != other.getPersonalLineId()) {
                return false;
            }
            if (!this.getParamCase().equals(other.getParamCase())) {
                return false;
            }
            switch (this.paramCase_) {
                case 11: {
                    if (this.getLevel() != other.getLevel()) {
                        return false;
                    }
                    break;
                }
                case 6: {
                    if (this.getChapterId() != other.getChapterId()) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getPersonalLineId();
            switch (this.paramCase_) {
                case 11: {
                    hash = 37 * hash + 11;
                    hash = 53 * hash + this.getLevel();
                    break;
                }
                case 6: {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getChapterId();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UnlockPersonalLineRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockPersonalLineRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineRsp.PARSER, input);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineRsp.PARSER, input, extensionRegistry);
        }
        
        public static UnlockPersonalLineRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockPersonalLineRsp.PARSER, input);
        }
        
        public static UnlockPersonalLineRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockPersonalLineRsp.PARSER, input, extensionRegistry);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineRsp.PARSER, input);
        }
        
        public static UnlockPersonalLineRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockPersonalLineRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UnlockPersonalLineRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UnlockPersonalLineRsp prototype) {
            return UnlockPersonalLineRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UnlockPersonalLineRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UnlockPersonalLineRsp getDefaultInstance() {
            return UnlockPersonalLineRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<UnlockPersonalLineRsp> parser() {
            return UnlockPersonalLineRsp.PARSER;
        }
        
        @Override
        public Parser<UnlockPersonalLineRsp> getParserForType() {
            return UnlockPersonalLineRsp.PARSER;
        }
        
        @Override
        public UnlockPersonalLineRsp getDefaultInstanceForType() {
            return UnlockPersonalLineRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UnlockPersonalLineRsp();
            PARSER = new AbstractParser<UnlockPersonalLineRsp>() {
                @Override
                public UnlockPersonalLineRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UnlockPersonalLineRsp(input, extensionRegistry);
                }
            };
        }
        
        public enum ParamCase implements Internal.EnumLite, InternalOneOfEnum
        {
            LEVEL(11), 
            CHAPTER_ID(6), 
            PARAM_NOT_SET(0);
            
            private final int value;
            
            private ParamCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ParamCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ParamCase forNumber(final int value) {
                switch (value) {
                    case 11: {
                        return ParamCase.LEVEL;
                    }
                    case 6: {
                        return ParamCase.CHAPTER_ID;
                    }
                    case 0: {
                        return ParamCase.PARAM_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ParamCase[] value() {
                return new ParamCase[] { ParamCase.LEVEL, ParamCase.CHAPTER_ID, ParamCase.PARAM_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnlockPersonalLineRspOrBuilder
        {
            private int paramCase_;
            private Object param_;
            private int retcode_;
            private int personalLineId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockPersonalLineRsp.class, Builder.class);
            }
            
            private Builder() {
                this.paramCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UnlockPersonalLineRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.personalLineId_ = 0;
                this.paramCase_ = 0;
                this.param_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
            }
            
            @Override
            public UnlockPersonalLineRsp getDefaultInstanceForType() {
                return UnlockPersonalLineRsp.getDefaultInstance();
            }
            
            @Override
            public UnlockPersonalLineRsp build() {
                final UnlockPersonalLineRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UnlockPersonalLineRsp buildPartial() {
                final UnlockPersonalLineRsp result = new UnlockPersonalLineRsp(this);
                result.retcode_ = this.retcode_;
                result.personalLineId_ = this.personalLineId_;
                if (this.paramCase_ == 11) {
                    result.param_ = this.param_;
                }
                if (this.paramCase_ == 6) {
                    result.param_ = this.param_;
                }
                result.paramCase_ = this.paramCase_;
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
                if (other instanceof UnlockPersonalLineRsp) {
                    return this.mergeFrom((UnlockPersonalLineRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UnlockPersonalLineRsp other) {
                if (other == UnlockPersonalLineRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getPersonalLineId() != 0) {
                    this.setPersonalLineId(other.getPersonalLineId());
                }
                switch (other.getParamCase()) {
                    case LEVEL: {
                        this.setLevel(other.getLevel());
                        break;
                    }
                    case CHAPTER_ID: {
                        this.setChapterId(other.getChapterId());
                        break;
                    }
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
                UnlockPersonalLineRsp parsedMessage = null;
                try {
                    parsedMessage = UnlockPersonalLineRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UnlockPersonalLineRsp)e.getUnfinishedMessage();
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
            public ParamCase getParamCase() {
                return ParamCase.forNumber(this.paramCase_);
            }
            
            public Builder clearParam() {
                this.paramCase_ = 0;
                this.param_ = null;
                this.onChanged();
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
            public int getPersonalLineId() {
                return this.personalLineId_;
            }
            
            public Builder setPersonalLineId(final int value) {
                this.personalLineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPersonalLineId() {
                this.personalLineId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLevel() {
                return this.paramCase_ == 11;
            }
            
            @Override
            public int getLevel() {
                if (this.paramCase_ == 11) {
                    return (int)this.param_;
                }
                return 0;
            }
            
            public Builder setLevel(final int value) {
                this.paramCase_ = 11;
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                if (this.paramCase_ == 11) {
                    this.paramCase_ = 0;
                    this.param_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasChapterId() {
                return this.paramCase_ == 6;
            }
            
            @Override
            public int getChapterId() {
                if (this.paramCase_ == 6) {
                    return (int)this.param_;
                }
                return 0;
            }
            
            public Builder setChapterId(final int value) {
                this.paramCase_ = 6;
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChapterId() {
                if (this.paramCase_ == 6) {
                    this.paramCase_ = 0;
                    this.param_ = null;
                    this.onChanged();
                }
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
    
    public interface UnlockPersonalLineRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getPersonalLineId();
        
        boolean hasLevel();
        
        int getLevel();
        
        boolean hasChapterId();
        
        int getChapterId();
        
        UnlockPersonalLineRsp.ParamCase getParamCase();
    }
}
